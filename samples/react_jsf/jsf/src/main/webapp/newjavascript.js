/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


let essai = '[{"number":"INS-001","planeModel":{"designation":"Airbus A380","range":12000,"capacity":480,"id":1,"designation$":{"present":true},"range$":{"present":true},"capacity$":{"present":true}},"flightHours":0,"id":13,"planeModel$":{"capacity":{"present":true},"present":true,"range":{"present":true},"designation":{"present":true}},"number$":{"present":true},"flightHours$":{"present":true}},{"number":"INS-002","planeModel":{"designation":"Airbus A380","range":12000,"capacity":480,"id":1,"designation$":{"present":true},"range$":{"present":true},"capacity$":{"present":true}},"flightHours":0,"id":14,"planeModel$":{"capacity":{"present":true},"present":true,"range":{"present":true},"designation":{"present":true}},"number$":{"present":true},"flightHours$":{"present":true}},{"number":"INS-003","planeModel":{"designation":"Boeing 747","range":12000,"capacity":480,"id":2,"designation$":{"present":true},"range$":{"present":true},"capacity$":{"present":true}},"flightHours":0,"id":15,"planeModel$":{"capacity":{"present":true},"present":true,"range":{"present":true},"designation":{"present":true}},"number$":{"present":true},"flightHours$":{"present":true}},{"number":"INS-004","planeModel":{"designation":"Boeing 747","range":12000,"capacity":480,"id":2,"designation$":{"present":true},"range$":{"present":true},"capacity$":{"present":true}},"flightHours":0,"id":16,"planeModel$":{"capacity":{"present":true},"present":true,"range":{"present":true},"designation":{"present":true}},"number$":{"present":true},"flightHours$":{"present":true}}]';

let resultat = JSON.parse(essai);
console.log(resultat);