import React, { Component }  from 'react';
import ChangeMyNameComponent from './ChangeMyNameComponent';
import AndMineTooComponent   from './AndMineTooComponent';

export default class Details extends Component {


    constructor() {
        super();
        this.state = {
            component : undefined
        }
    }

    setEntity(entityName) {
        this.setState(
                {
                    component : entityName
                }
        )
    }

        
    render() {
        const component = (() => {
            switch (this.state.component) {
                case "ChangeMyName":
                    return <ChangeMyNameComponent/>;
                case "AndMineToo":
                    return <AndMineTooComponent/>;
                default:
                    return (<div>Nouveau</div>);
            }
        })();
        return (component);
    }
}
