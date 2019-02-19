import React from "react";
import "./List.css";

function Pilot(props) {
    return (<div className="list">
        <span>{props.designation}</span>
    </div>);
}

export default Pilot;