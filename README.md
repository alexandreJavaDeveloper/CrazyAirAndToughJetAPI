# CrazyAirAndToughJetAPI

e.g: curl --data '{"origin":"LHR", "destination":"LHR", "departureDate":"05-10-2010", "returnDate":"06-10-2013", "numberOfPassengers":200}' -v -X GET -H 'Content-Type:application/json' http://localhost:8090/crazyair


e.g: curl --data '{"from":"LHR", "to":"AMS", "departureDay":"25", "departureMonth":10, "departureYear":"2010", "returnDay":"1", "returnMonth":12, "returnYear":"2010", "numberOfAdults":200}' -v -X GET -H 'Content-Type:application/json' http://localhost:8090/toughjet