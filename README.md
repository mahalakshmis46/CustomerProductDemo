# CustomerProductDemo
Create GET and POST mapping for customer and list of products

POST request: http://localhost:8080/customer/createCustomer

{
	"name": "maha",
	"lastname": "soundar",
	"dateOfBirth": "1990-09-09",
	"products": [{
		"name": "toy",
		"value": 2
		},
		{
		"name": "dress",
		"value": 7
		}
	]
}

GET Request: http://localhost:8080/customer/1
