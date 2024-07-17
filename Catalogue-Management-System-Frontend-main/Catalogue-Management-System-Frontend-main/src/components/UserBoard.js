import React from "react";
import { useNavigate } from "react-router-dom";
import { Container, Row, Col, Card } from "react-bootstrap";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faEye, faSearch } from "@fortawesome/free-solid-svg-icons";
import "./UserBoard.css";

const UserBoard = () => {
  const navigate = useNavigate();

  const userFunctions = [
    { path: "/view-all-products", title: "View All Products", icon: faEye },
    { path: "/view-products-by-name", title: "View Products by Name", icon: faSearch },
  ];

  return (
    <Container fluid className="user-dashboard py-4">
      <Row className="mb-4">
        <Col>
          <h1 className="text-center text-primary">User Dashboard</h1>
        </Col>
      </Row>
      <Row>
        {userFunctions.map((func, index) => (
          <Col key={index} xs={12} sm={6} md={4} lg={4} className="mb-4">
            <Card
              className="user-card h-100 shadow-sm"
              onClick={() => navigate(func.path)}
            >
              <Card.Body className="d-flex flex-column align-items-center justify-content-center text-center">
                <FontAwesomeIcon icon={func.icon} size="3x" className="mb-3 text-primary" />
                <Card.Title>{func.title}</Card.Title>
              </Card.Body>
            </Card>
          </Col>
        ))}
      </Row>
    </Container>
  );
};

export default UserBoard;