import React, { Component } from 'react';



export default class AndMineTooComponent extends Component {
    
    render() {
        return (
            <div onClick={() => this.props.onClick(this) } className="AndMineToo">
                {this.props.name}
            </div>
        )
    }

}