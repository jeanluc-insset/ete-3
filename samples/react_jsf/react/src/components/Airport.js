import React from "react";
import "./List.css";

function Airport(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default Airport;