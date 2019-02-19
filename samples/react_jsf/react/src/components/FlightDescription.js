import React from "react";
import "./List.css";

function FlightDescription(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default FlightDescription;