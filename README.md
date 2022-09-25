# bean-validation

## javax.validation.constraints.Email

> Email 어노테이션은 nullable 합니다.  
> 따라서 정확한 validation 을 위해서는 @NotNull 도 같이 활용하기를 권장합니다.

### request sample

```http request
POST http://localhost:8080/email/without-not-null
Content-Type: application/json

{
  "email": "aaa@bbb.com"
}
```

### sample request result

```text
null // 200
"email": null // 200
"email": "" // 200
"email": "aaa@bbb.com" // 200
"email": "aaa@bbb" // 200

"email": " " // 400. 올바른 형식의 이메일 주소여야 합니다
"email": "aaa@bbb.com " // 400
"email": "aaa" // 400
"email": "aaa@.com" // 400
```
