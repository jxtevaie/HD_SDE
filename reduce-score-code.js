import React, { Component } from "react";

// arr.reduce(callback( accumulator, currentValue[, index[, array]] )
function getTotal(acc, obj) {
  return acc + obj.goals;
}

function myFilter(goalsNumber) {
  return function (obj) {
    return obj.goals >= goalsNumber;
  };
}

class App extends Component {
  render() {
    let scores = [
      { id: 112, team: "Tottenham", goals: 10 },
      { id: 114, team: "Chelsea", goals: 12 },
      { id: 120, team: "Newcastle", goals: 11 },
      { id: 115, team: "Wolves", goals: 14 }
    ];
    return (
      <div className="App">
        Total goals is (no filter): {scores.reduce(getTotal, 0)}
        <br />
        Map Function (no filter):
        {scores.map((s) => (
          <div key={s.id}>
            {s.team},{s.goals}
            <br />
          </div>
        ))}
        Total goals is (with filter):
        {scores.filter(myFilter(12)).reduce(getTotal, 0)}
        <br />
        Map Function (with filter):
        {scores.filter(myFilter(12)).map((s) => (
          <div key={s.id}>
            {s.team},{s.goals}
            <br />
          </div>
        ))}
      </div>
    ); // end of return statement
  } // end of render function
} // end of class
export default App;
