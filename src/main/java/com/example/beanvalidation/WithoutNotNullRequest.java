package com.example.beanvalidation;

import javax.validation.constraints.Email;

public record WithoutNotNullRequest(@Email String email) {
}
