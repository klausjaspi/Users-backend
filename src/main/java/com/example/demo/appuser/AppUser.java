package com.example.demo.appuser;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUser implements UserDetails {

    @java.lang.Override
    public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @java.lang.Override
    public String getPassword() {
        return null;
    }

    @java.lang.Override
    public java.lang.String getUsername() {
        return null;
    }

    @java.lang.Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @java.lang.Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @java.lang.Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @java.lang.Override
    public boolean isEnabled() {
        return false;
    }
}
