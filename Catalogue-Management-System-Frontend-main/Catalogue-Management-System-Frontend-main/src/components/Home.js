import React from 'react';
import { Container, Row, Col, Card, Button } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faDatabase, faCog, faChartLine, faArrowRight } from '@fortawesome/free-solid-svg-icons';
import './Home.css'; // Make sure this CSS file exists with appropriate styles
import 'bootstrap/dist/css/bootstrap.min.css';
import { FaMapMarkerAlt, FaPhone, FaEnvelope } from 'react-icons/fa';
 
const Home = () => {
  return (
    <>
      <section id="intro" className="py-5">
        <Container>
          <Row className="align-items-center">
            <Col md={6}>
              <img src="/image.jpg" alt="Intro" className="img-fluid rounded" />
            </Col>
            <Col md={6}>
              <h1 className="text-primary fw-bold mb-4">
                Catalogue Management System for Internet Service Products
              </h1>
              <p className="lead mb-4">
                Welcome to the Catalogue Management System (CMS), your premier
                platform for efficient management and display of internet service
                products. Designed to meet the diverse needs of telecom giants
                like AT&T, Verizon, and T-Mobile, our CMS provides a robust
                solution for administrators and managers alike.
              </p>
              {/* <Button variant="primary" size="lg" className="me-3">Get Started</Button>
              <Button variant="outline-primary" size="lg">Learn More</Button> */}
            </Col>
          </Row>
        </Container>
      </section>
 
      <section id="features" className="py-5 bg-light">
        <Container>
          <h2 className="text-center mb-5">Key Features</h2>
          <Row>
            {[
              { icon: faDatabase, title: 'Comprehensive Product Management', description: 'Easily manage and organize your entire product catalogue.' },
              { icon: faCog, title: 'Detailed Specifications', description: 'Handle complex product specifications with ease.' },
              { icon: faChartLine, title: 'Powerful Reporting Tools', description: 'Generate insightful reports to drive business decisions.' },
            ].map((feature, index) => (
              <Col md={4} key={index}>
                <Card className="h-100 feature-card">
                  <Card.Body className="text-center">
                    <FontAwesomeIcon icon={feature.icon} size="3x" className="mb-3 text-primary" />
                    <Card.Title>{feature.title}</Card.Title>
                    <Card.Text>{feature.description}</Card.Text>
                  </Card.Body>
                </Card>
              </Col>
            ))}
          </Row>
        </Container>
      </section>
 
      <section id="about" className="py-5">
        <Container>
          <Row className="align-items-center">
            <Col md={6} className="order-md-2">
              <div className="about-image rounded-circle overflow-hidden">
                <img src="/about.png" alt="About CMS" className="img-fluid" />
              </div>
            </Col>
            <Col md={6} className="order-md-1">
              <div className="about-content bg-white p-4 rounded shadow-sm">
                <h2 className="text-primary fw-bold mb-4">About Us</h2>
                <p className="lead mb-4">
                  At CMS, we understand the challenges businesses face in organizing and
                  optimizing their product catalogues. Our mission is to simplify this
                  process through innovative technology and user-centric solutions.
                </p>
                <p className="mb-4">
                  With a focus on efficiency and ease of use, CMS offers a comprehensive
                  suite of features designed to enhance your catalogue management experience.
                </p>
                {/* <Button variant="primary">Learn More <FontAwesomeIcon icon={faArrowRight} className="ms-2" /></Button> */}
              </div>
            </Col>
          </Row>
        </Container>
      </section>
 
      <section id="testimonials" className="py-5 bg-light">
        <Container>
          <h2 className="text-center mb-5">What Our Clients Say</h2>
          <Row>
            {[
              { name: 'John Doe', company: 'TechCorp', text: 'CMS has revolutionized how we manage our product catalogue. Highly recommended!' },
              { name: 'Jane Smith', company: 'TelecomGiants', text: 'The efficiency gains we have seen with CMS are remarkable. Its a game-changer.' },
            ].map((testimonial, index) => (
              <Col md={6} key={index}>
                <Card className="h-100 testimonial-card">
                  <Card.Body>
                    <Card.Text>"{testimonial.text}"</Card.Text>
                    <footer className="blockquote-footer mt-3">
                      {testimonial.name} from <cite title="Source Title">{testimonial.company}</cite>
                    </footer>
                  </Card.Body>
                </Card>
              </Col>
            ))}
          </Row>
        </Container>
      </section>
 
      <footer className="bg-dark text-white py-4">
        <Container>
          <Row>
            <Col md={6}>
              <h5>Catalogue Management System</h5>
              <p>Streamlining telecom product management</p>
            </Col>
            <Col md={6}>
            <div className="col-md-4 mb-4">
              <h3>Contact Us</h3>
              <ul className="contact-list">
                <li><FaMapMarkerAlt /> 123 Main St, Anytown USA</li>
                <li><FaPhone /> (123) 456-7890</li>
                <li><FaEnvelope /> info@quickresolve.com</li>
              </ul>
            </div>
            
            </Col>
          </Row>
          <hr />
          <p className="text-center mb-0">&copy; 2024 Catalogue Management System. All rights reserved.</p>
        </Container>
      </footer>
    </>
  );
};
 
export default Home;