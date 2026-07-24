import React from "react";
import CalculateScore from "./CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="John"
        School="ABC Public School"
        total={85}
        goal={100}
      />
    </div>
  );
}

export default App;