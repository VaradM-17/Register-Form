<h1>Registration Form</h1>

<h2>Overview</h2>
<p>
    This project is a simple web registration form where users can enter their personal and educational details. The submitted information is stored in a MySQL database.
</p>

<h3>Features</h3>
<ul>
    <li>User-friendly interface for registration.</li>
    <li>Fields for personal information and education.</li>
    <li>Data stored in a MySQL database using Java Servlets.</li>
</ul>

<h3>Technologies Used</h3>
<ul>
    <li>HTML, CSS for frontend</li>
    <li>Java Servlets for backend</li>
    <li>MySQL for the database</li>
</ul>

<h3>Getting Started</h3>
<h4>Prerequisites</h4>
<ul>
    <li>JDK 8 or later</li>
    <li>Apache Tomcat</li>
    <li>MySQL Database</li>
</ul>

<h3>Installation Steps</h3>
<ol>
    <li><strong>Clone the repository:</strong>
        <pre><code>git clone https://github.com/yourusername/registration-form.git</code></pre>
    </li>
    <li><strong>Set up MySQL:</strong>
        <p>Create a database named <code>register</code> and a table <code>rdetails</code> with the necessary columns.</p>
    </li>
    <li><strong>Update Database Connection:</strong>
        <p>Modify the database connection settings in <code>RegisterPage.java</code> to match your MySQL credentials.</p>
    </li>
    <li><strong>Deploy the application:</strong>
        <p>Deploy the project to your servlet container (e.g., Apache Tomcat).</p>
    </li>
    <li><strong>Open the Form:</strong>
        <p>Visit <code>http://localhost:8080/registration-form</code> in your browser.</p>
    </li>
</ol>

<h3>Usage</h3>
<p>Fill out the form and click "Submit." A confirmation message will appear upon successful registration.</p>

<h3>Contributing</h3>
<p>Feel free to contribute by submitting issues or pull requests.</p>
