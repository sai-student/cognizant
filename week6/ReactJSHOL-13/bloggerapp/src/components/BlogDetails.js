function BlogDetails(props) {
  return (
    <div className="details-section">
      <h1>Blog Details</h1>

      {props.blogs.length > 0 ? (
        props.blogs.map((blog) => (
          <div className="item" key={blog.id}>
            <h2>{blog.title}</h2>
            <h4>{blog.author}</h4>
            <p>{blog.description}</p>
          </div>
        ))
      ) : (
        <p>No blogs are available.</p>
      )}
    </div>
  );
}

export default BlogDetails;