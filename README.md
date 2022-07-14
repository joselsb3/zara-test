
# Zara Interview test

Realización de un api rest para el cálculo del precio de un producto a fecha concreta.



## API Reference

#### Get price

```http
  GET /brands/${brand_id}/products/${product_id}/prices
```

| Path Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `brand_id` | `int` | **Required**. Brand ID |
| `product_id` | `int` | **Required**. Brand ID |


| Query Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `date` | `String` | **Required**. Date Format (yyyy-MM-dd.HH.mm.ss) |





## Tech Stack

**Server:** Java, SpringBoot, Cucumber, JPA, H2 database, Arquitectura hexagonal. 