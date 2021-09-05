# Backend_Liv2Train_Awanish_Kumar_singh
This is a repo for the purpose of the assignment given for the internship for the role of the backend developer role.


<h1>Post mapping url for the addition of the training center.</h1>
* localhost:9001/center/
* method : POST
* input : 

{
    "centerName":"Narayan",
    "centerCode":"O5Jpdsewj54a",
    "address":{
        "detailAddress":"GOriakothi",
        "city":"Gopalganj",
        "state":"Bihar",
        "pinCode":"840435"
    },
    "studentCapacity":450,
    "courses":["EE","SC","ssc"],
    "contactEmail":"ansih@g.com",
    "contactPhone":"9414253672"

}

***

output : 
* case 1 : when failed to load due to some error:

{
    "timestamp": "2021-09-05T18:02:35.325+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "Validation failed for object='trainingCenter'. Error count: 1",
    "errors": [
        {
            "codes": [
                "Email.trainingCenter.contactEmail",
                "Email.contactEmail",
                "Email.java.lang.String",
                "Email"
            ],
            "arguments": [
                {
                    "codes": [
                        "trainingCenter.contactEmail",
                        "contactEmail"
                    ],
                    "arguments": null,
                    "defaultMessage": "contactEmail",
                    "code": "contactEmail"
                },
                [],
                {
                    "arguments": null,
                    "defaultMessage": ".*",
                    "codes": [
                        ".*"
                    ]
                }
            ],
            "defaultMessage": "Email should be valid!!",
            "objectName": "trainingCenter",
            "field": "contactEmail",
            "rejectedValue": "ansih.com",
            "bindingFailure": false,
            "code": "Email"
        }
    ],
    "path": "/center/"
}

***

case 2: when successfully saved in the database.
{
    "status": 0,
    "result": {
        "id": 4,
        "centerName": "Narayan",
        "centerCode": "O5Jpdsewj54a",
        "address": {
            "detailAddress": "GOriakothi",
            "city": "Gopalganj",
            "state": "Bihar",
            "pinCode": "840435"
        },
        "studentCapacity": 450,
        "courses": [
            "EE",
            "SC",
            "ssc"
        ],
        "date": "2021-09-05T17:54:12.827+00:00",
        "contactEmail": "ansih@g.com",
        "contactPhone": "9414253672"
    }
}

***
