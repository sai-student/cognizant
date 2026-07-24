function FlightDetails() {
  const flights = [
    {
      id: 1,
      flightName: "Air India",
      source: "Chennai",
      destination: "Delhi",
      price: 6500
    },
    {
      id: 2,
      flightName: "IndiGo",
      source: "Bengaluru",
      destination: "Mumbai",
      price: 4800
    },
    {
      id: 3,
      flightName: "SpiceJet",
      source: "Hyderabad",
      destination: "Kolkata",
      price: 5200
    }
  ];

  return (
    <div>
      <h2>Flight Details</h2>

      <table>
        <thead>
          <tr>
            <th>Flight Name</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Ticket Price</th>
          </tr>
        </thead>

        <tbody>
          {flights.map((flight) => (
            <tr key={flight.id}>
              <td>{flight.flightName}</td>
              <td>{flight.source}</td>
              <td>{flight.destination}</td>
              <td>₹{flight.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default FlightDetails;