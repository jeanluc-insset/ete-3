import React from "react";
import "./List.css";

function Address(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default Address;