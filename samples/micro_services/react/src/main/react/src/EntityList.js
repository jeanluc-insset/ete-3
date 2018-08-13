import React, { Component } from 'react';



import EntityName from './EntityName';
import ChangeMyNameComponent from './ChangeMyNameComponent';
import AndMineTooComponent from './AndMineTooComponent';


export default class EntityList extends Component {

    state = {
        selected : undefined
    }
    
    renderEntity(entityName) {
        return (
            <EntityName name={entityName}
                onClick = {(entity) => this.select(entity)}
            />
        );
    }

    select(entityName) {
        alert("Coucou from : " + entityName.props.name);
    }
        
    render() { 
        return (
          <div className="EntityList">
          {this.renderEntity("ChangeMyName")}
          {this.renderEntity("AndMineToo")}
          </div>
          )
    }

}





