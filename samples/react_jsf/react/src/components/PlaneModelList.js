import React from "react";

import PlaneModel from "./PlaneModel";

class PlaneModelList extends React.Component {

    constructor(props) {
        super();
        this.state = { items: [] };
    }


    componentDidMount() {
        loadFromServer(10);
    }


    loadFromServer(pageSize) {
	fetch(`http://localhost:8080/royal_and_loyal/webresources/customer`)
            .done(collection => {
		console.log(collection);
	});
    }



//
//
//
//    loadFromServer(pageSize) {
//	fetch(`http://localhost:8080/jsf/webresources/planeModel`)
//            .then(collection => {
//		return client({
//			method: 'GET',
//			path: collection.entity._links.profile.href,
//			headers: {'Accept': 'application/schema+json'}
//		}).then(schema => {
//			this.schema = schema.entity;
//			return collection;
//		});
//	}).done(collection => {
//		this.setState({
//			entities: collection.entity._embedded.employees,
//			attributes: Object.keys(this.schema.properties),
//			pageSize: pageSize,
//			links: employeeCollection.entity._links});
//	});
//    }
//

    render() {
        return (
            <div>List of All Instances of PlaneModel</div>
        );
    }
}


export default PlaneModelList;