import FlightDetails from "./FlightDetails";

function UserPage() {
  const handleBooking = () => {
    alert("Your ticket has been booked successfully!");
  };

  return (
    <div>
      <h1>Welcome back</h1>

      <p>You are logged in. You can now book your ticket.</p>

      <FlightDetails />

      <button className="book-button" onClick={handleBooking}>
        Book Ticket
      </button>
    </div>
  );
}

export default UserPage;