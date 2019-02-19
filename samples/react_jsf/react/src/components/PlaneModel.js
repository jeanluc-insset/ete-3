import React from "react";
import "./List.css";

function PlaneModel(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default PlaneModel;