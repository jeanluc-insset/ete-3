import React from "react";
import "./List.css";

function Flight(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default Flight;