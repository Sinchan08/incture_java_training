# Spring Security – Authentication & Authorization

## 1. Introduction
Spring Security is a powerful and customizable framework for securing Java/Spring applications.  
It handles **Authentication** (who you are) and **Authorization** (what you can do).

---

## 2. Authentication
- **Definition**: Process of verifying the identity of the user.
- **Goal**: Confirm that the user is who they claim to be.
- **Flow**:
  1. User sends credentials (username/password).
  2. Application verifies credentials via an **AuthenticationProvider**.
  3. If successful, Spring creates an `Authentication` object and stores it in `SecurityContext`.

**Key Interfaces/Classes**:
- `Authentication` – Represents the current user.
- `AuthenticationManager` – Handles authentication requests.
- `AuthenticationProvider` – Validates credentials (custom logic possible).
- `UsernamePasswordAuthenticationToken` – Common authentication token for username/password.
- `UserDetailsService` – Loads user-specific data.

**Example: Custom AuthenticationProvider**
```java
@Override
public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    String username = authentication.getName();
    String password = authentication.getCredentials().toString();

    if ("sinchana".equals(username) && "12".equals(password)) {
        return new UsernamePasswordAuthenticationToken(
            username,
            password,
            Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))
        );
    } else {
        throw new BadCredentialsException("Invalid username or password");
    }
}
3. Authorization
Definition: Deciding whether an authenticated user has permission to access a resource.

Goal: Control what an authenticated user can do.

Flow:

After authentication, user tries to access a resource.

Spring checks user's roles/authorities.

Grants or denies access.

Key Concepts:

Role – High-level permission (e.g., ROLE_ADMIN, ROLE_USER).

Authority – Fine-grained permission (e.g., READ_PRIVILEGE).

Annotations:

@PreAuthorize("hasRole('ADMIN')") – Method accessible only to ADMIN role.

@Secured("ROLE_ADMIN") – Similar to @PreAuthorize for roles.

@EnableGlobalMethodSecurity(prePostEnabled = true) – Enables method-level security.

Example:

java
Copy
Edit
@GetMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public String adminOnly() {
    return "Welcome, Admin!";
}
4. Security Filters
Spring Security uses a filter chain.

UsernamePasswordAuthenticationFilter – Handles login requests.

BasicAuthenticationFilter – Handles HTTP Basic authentication.

5. Common Authentication Mechanisms
HTTP Basic Auth – Username/password sent in every request header.

Form Login – Standard login page form.

JWT Authentication – Token-based authentication.

OAuth2 / SSO – External identity providers like Google, Facebook.

6. Security Configuration (Java-based)
Example SecurityFilterChain config in Spring Boot 3+:

java
Copy
Edit
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/admin/**").hasRole("ADMIN")
            .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
            .anyRequest().authenticated()
        )
        .formLogin(withDefaults())
        .httpBasic(withDefaults());
    return http.build();
}