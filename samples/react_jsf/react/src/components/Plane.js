import React from "react";
import "./List.css";

function Plane(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default Plane;