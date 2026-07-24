import { useState } from "react";
import "./App.css";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

import { books, blogs, courses } from "./data/Data";

function App() {
  const [selectedView, setSelectedView] = useState("all");
  const [showDetails, setShowDetails] = useState(true);

  /*
    Conditional Rendering Method:
    switch statement
  */
  const displaySelectedComponent = () => {
    switch (selectedView) {
      case "books":
        return <BookDetails books={books} />;

      case "blogs":
        return <BlogDetails blogs={blogs} />;

      case "courses":
        return <CourseDetails courses={courses} />;

      case "all":
        return (
          <div className="details-container">
            <CourseDetails courses={courses} />
            <BookDetails books={books} />
            <BlogDetails blogs={blogs} />
          </div>
        );

      default:
        return <h2>Please select a valid option.</h2>;
    }
  };

  /*
    Conditional Rendering Method:
    if-else with early return
  */
  if (!showDetails) {
    return (
      <div className="app">
        <h1>Blogger App</h1>

        <button onClick={() => setShowDetails(true)}>
          Show Details
        </button>

        <h2>Details are hidden</h2>
      </div>
    );
  }

  return (
    <div className="app">
      <h1 className="main-heading">Blogger App</h1>

      <div className="button-container">
        <button onClick={() => setSelectedView("all")}>
          Show All
        </button>

        <button onClick={() => setSelectedView("books")}>
          Book Details
        </button>

        <button onClick={() => setSelectedView("blogs")}>
          Blog Details
        </button>

        <button onClick={() => setSelectedView("courses")}>
          Course Details
        </button>

        <button onClick={() => setShowDetails(false)}>
          Hide Details
        </button>
      </div>

      {/*
        Conditional Rendering Method:
        Function with switch statement
      */}
      {displaySelectedComponent()}

      {/*
        Conditional Rendering Method:
        Logical AND operator
      */}
      {selectedView === "books" && (
        <p className="message">You are viewing book details.</p>
      )}

      {/*
        Conditional Rendering Method:
        Ternary operator
      */}
      <p className="status">
        {showDetails ? "Details are visible" : "Details are hidden"}
      </p>
    </div>
  );
}

export default App;