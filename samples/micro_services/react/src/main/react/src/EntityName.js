import React, { Component } from 'react';



export default class EntityName extends Component {
    
    render() {
        return (
            <div onClick={() => this.props.onClick(this) } className="EntityName">
                {this.props.name}
            </div>
        )
    }

}


