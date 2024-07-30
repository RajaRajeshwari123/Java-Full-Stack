import React from 'react';
import { Container, Row, Col, Card } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faDatabase, faCog, faChartLine } from '@fortawesome/free-solid-svg-icons';
import './Home.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { FaMapMarkerAlt, FaPhone, FaEnvelope, FaFacebookF, FaTwitter, FaLinkedinIn, FaInstagram } from 'react-icons/fa';

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
              <h2 className="text-primary fw-bold mb-4">
                Catalogue Management System 
              </h2>
              <p className="lead mb-4 text-justify">
                Welcome to the Catalogue Management System (CMS), your premier
                platform for efficient management and display of internet service
                products. Designed to meet the diverse needs of telecom giants
                like AT&T, Verizon, and T-Mobile, our CMS provides a robust
                solution for administrators and managers alike.
              </p>
            </Col>
          </Row>
        </Container>
      </section>

      <section id="features" className="py-5">
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
        <Container className="about-container">
          <Row className="align-items-center">
            <Col md={6}>
              <div className="about-content p-4 rounded">
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
              </div>
            </Col>
            <Col md={6}>
              <div className="about-image rounded-circle overflow-hidden">
                <img src="/about.png" alt="About CMS" className="img-fluid" />
              </div>
            </Col>
          </Row>
        </Container>
      </section>

      {/* <footer className="py-4">
        <Container>
          <Row>
            
            <Col md={4} className="footer-left" >
              <h5>Catalogue Management System</h5>
              <p>Streamlining telecom product management</p>
              <p>Empowering businesses with efficient catalogue solutions</p>
              <p>Innovating for the future of product management</p>
            </Col>
            
            <Col md={4}>
              <h5>Contact Us</h5>
              <ul className="contact-list">
                <li><FaMapMarkerAlt /> 123 Main St, Anytown USA</li>
                <li><FaPhone /> (123) 456-7890</li>
                <li><FaEnvelope /> info@quickresolve.com</li>
              </ul>
            </Col>
            <Col md={4}>
              <h5>Follow Us</h5>
              <div className="social-icons">
                <a href="#"><FaFacebook /></a>
                <a href="#"><FaTwitter /></a>
                <a href="#"><FaLinkedin /></a>
                <a href="#"><FaInstagram /></a>
              </div>
            </Col>
          </Row>
          <hr />
          {/* <p className="text-center mb-0">&copy; 2024 Catalogue Management System. All rights reserved.</p> */}
        {/* </Container> */}
     
      <footer id="contact" className="footer">
        <Container>
          <div className="row" style={{ "padding-top": "10px" }}>
            <div className="col-md-4 mb-4 left-footer">
              <h3>About CMS</h3>
              <p>Streamlining telecom product management. Empowering businesses with efficient catalogue solutions.Innovating for the future of product management</p>
            </div>
            <div className="col-md-4 mb-4">
              <h3>Contact Us</h3>
              <ul className="contact-list">
                <li><FaMapMarkerAlt /> 123 Main St, Anytown USA </li>
                <li><FaPhone /> (91)- 8890356457</li>
                <li><FaEnvelope /> info@cms.com</li>
              </ul>
            </div>
            <div className="col-md-4 mb-4">
              <h3 className="text-center">Follow Us</h3>
              <div className="social-links">
                {[FaFacebookF, FaTwitter, FaInstagram, FaLinkedinIn].map((Icon, index) => (
                  <a key={index} href="#" className="social-icon">
                    <Icon />
                  </a>
                ))}
              </div>
            </div>
          </div>
        </Container>
      </footer>
    </>
  );
};

export default Home;