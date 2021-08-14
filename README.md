# spring-boot-graphql


POST http://localhost:8091/rest/books

## allBooks
```graphql
{
	allBooks {
        isin
        title
        authors
    }
}
```

## book
```graphql
{
    book(id: "123") {
        title
    }
}
```


## all
```graphql
{
    allBooks {
        isin
        title
        authors
    }
    book(id: "123") {
        title
    }
}
```

Tutorial: https://www.youtube.com/watch?v=zX2I7-aIldE
