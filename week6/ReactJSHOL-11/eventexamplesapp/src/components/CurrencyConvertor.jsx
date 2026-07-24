import { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);

    this.state = {
      amount: "",
      currency: "",
    };
  }

  // Handles changes in both form fields
  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value,
    });
  };

  // Handles the Submit button click
  handleSubmit = (event) => {
    event.preventDefault();

    const amount = Number(this.state.amount);
    const currency = this.state.currency.trim().toLowerCase();

    if (this.state.amount === "" || currency === "") {
      alert("Please enter the amount and currency");
      return;
    }

    if (Number.isNaN(amount) || amount < 0) {
      alert("Please enter a valid amount");
      return;
    }

    if (currency === "euro") {
      const rupees = amount * 80;

      alert(`Converting to Indian Rupees Amount is ${rupees}`);
    } else {
      alert("Please enter Euro as the currency");
    }
  };

  render() {
    return (
      <div className="currency-container">
        <h1>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <div className="form-row">
            <label htmlFor="amount">Amount:</label>

            <input
              id="amount"
              type="number"
              name="amount"
              value={this.state.amount}
              onChange={this.handleChange}
            />
          </div>

          <div className="form-row">
            <label htmlFor="currency">Currency:</label>

            <textarea
              id="currency"
              name="currency"
              value={this.state.currency}
              onChange={this.handleChange}
            />
          </div>

          <button type="submit">
            Submit
          </button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;