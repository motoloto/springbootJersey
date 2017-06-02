#### springbootJersey
A spring boot service using Jersey

Content-type : application/json

Test URL:

#get all
GET: http://localhost:8080/books

#get by id
GET: http://localhost:8080/books/1 or http://localhost:8080/books/2

#add
POST: http://localhost:8080/books
{
	"id": "3",
  	"bookName": "moto story",
  	"author": "motoloto"
}

#Update
PUT: http://localhost:8080/books/3
{
	"id": "3",
  	"bookName": "moto story2",
  	"author": "motoloto"
}

#Delete
DELETE: http://localhost:8080/books/3
