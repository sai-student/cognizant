function BookDetails(props) {
  return (
    <div className="details-section">
      <h1>Book Details</h1>

      {props.books.length > 0 &&
        props.books.map((book) => (
          <div className="item" key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))}

      {props.books.length === 0 && <p>No books are available.</p>}
    </div>
  );
}

export default BookDetails;