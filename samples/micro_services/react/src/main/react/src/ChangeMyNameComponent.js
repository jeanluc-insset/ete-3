import React, { Component } from 'react';



export default class ChangeMyNameComponent extends Component {
    
    render() {
        return (
            <div onClick={() => this.props.onClick(this) } className="ChangeMyName">
                {this.props.name}
            </div>
        )
    }

}