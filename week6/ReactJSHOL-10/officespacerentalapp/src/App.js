import React from "react";
import "./App.css";

function App() {
  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "Smart Office",
      Rent: 45000,
      Address: "Hyderabad"
    },
    {
      Name: "Tech Park",
      Rent: 90000,
      Address: "Pune"
    }
  ];

  return (
    <div className="container">
      <h1>Office Space, at Affordable Range</h1>

      {offices.map((office, index) => (
        <div key={index} className="card">
          {/* Placeholder instead of image */}
          <div className="image">No Image</div>

          <h2>Name: {office.Name}</h2>

          <h3
            className={
              office.Rent <= 60000 ? "textRed" : "textGreen"
            }
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;