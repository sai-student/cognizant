import FlightDetails from "./FlightDetails";

function GuestPage() {
  return (
    <div>
      <h1>Please sign up.</h1>

      <p>
        You can browse the available flights. Please login to book a ticket.
      </p>

      <FlightDetails />
    </div>
  );
}

export default GuestPage;