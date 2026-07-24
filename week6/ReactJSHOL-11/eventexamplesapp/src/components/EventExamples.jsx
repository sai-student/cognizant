import { Component } from "react";

class EventExamples extends Component {
  constructor(props) {
    super(props);

    this.state = {
      counter: 5,
    };
  }

  // Method 1: Increment counter
  incrementCounter = () => {
    this.setState(
      (previousState) => ({
        counter: previousState.counter + 1,
      }),
      () => {
        // Method 2 is called after incrementing
        this.sayHello();
      }
    );
  };

  // Static hello message
  sayHello = () => {
    alert("Hello Member1");
  };

  // Decrement counter
  decrementCounter = () => {
    this.setState((previousState) => ({
      counter: previousState.counter - 1,
    }));
  };

  // Function accepting an argument
  sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic event handling
  onPress = (event) => {
    alert("I was clicked");

    console.log("Event type:", event.type);
  };

  render() {
    return (
      <div>
        <h3>{this.state.counter}</h3>

        <button onClick={this.incrementCounter}>
          Increment
        </button>

        <br />

        <button onClick={this.decrementCounter}>
          Decrement
        </button>

        <br />

        <button onClick={() => this.sayWelcome("welcome")}>
          Say welcome
        </button>

        <br />

        <button onClick={this.onPress}>
          Click on me
        </button>
      </div>
    );
  }
}

export default EventExamples;