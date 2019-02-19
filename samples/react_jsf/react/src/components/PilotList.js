import React from "react";

import Pilot from "./Pilot";

class PilotList extends React.Component {

    constructor(props) {
        super();
        this.state = { items: [] };
    }


    componentDidMount() {
        loadFromServer(10);
    }


    loadFromServer(pageSize) {
	fetch(`http://localhost:8080/jsf/webresources/pilot`)
            .then(collection => {
		return client({
			method: 'GET',
			path: collection.entity._links.profile.href,
			headers: {'Accept': 'application/schema+json'}
		}).then(schema => {
			this.schema = schema.entity;
			return collection;
		});
	}).done(collection => {
		this.setState({
			entities: collection.entity._embedded.employees,
			attributes: Object.keys(this.schema.properties),
			pageSize: pageSize,
			links: employeeCollection.entity._links});
	});
    }


    render() {
        return (
            <div>List of All Instances of Pilot</div>
        );
    }
}


export default PilotList;