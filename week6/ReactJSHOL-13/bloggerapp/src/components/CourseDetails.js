function CourseDetails(props) {
  let courseDetails;

  if (props.courses.length > 0) {
    courseDetails = props.courses.map((course) => (
      <div className="item" key={course.id}>
        <h2>{course.name}</h2>
        <h4>{course.date}</h4>
      </div>
    ));
  } else {
    courseDetails = <p>No courses are available.</p>;
  }

  return (
    <div className="details-section">
      <h1>Course Details</h1>

      {courseDetails}
    </div>
  );
}

export default CourseDetails;