package com.example.beanvalidation;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public record WithNotNullRequest(@NotNull @Email String email) {
}
