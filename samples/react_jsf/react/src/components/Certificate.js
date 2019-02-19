import React from "react";
import "./List.css";

function Certificate(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default Certificate;