import React from "react";
import { useNavigate } from "react-router-dom";
import { Container, Row, Col, Card } from "react-bootstrap";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faPlus,
  faEye,
  faSearch,
  faEdit,
  faTrash,
  faUserEdit,
} from "@fortawesome/free-solid-svg-icons";
import "./BoardAdmin.css";

const BoardAdmin = () => {
  const navigate = useNavigate();

  const adminFunctions = [
    { path: "/add-products", title: "Add Product and Features", icon: faPlus },
    { path: "/view-product", title: "View Products", icon: faEye },
    { path: "/view-productbyname-admin", title: "View Products By Name", icon: faSearch },
    { path: "/update-product", title: "Update Products", icon: faEdit },
    { path: "/delete-feature", title: "Delete Features", icon: faTrash  },
    { path: "/delete-product", title: "Delete Product", icon: faTrash },
    { path: "/update-rolepage/:userId", title: "Update Role for User", icon: faUserEdit },
    { path: "/updateroles", title:"View All Users", icon: faEye}
  ];

  return (
    <Container fluid className="admin-dashboard py-4">
      <Row className="mb-4">
        <Col>
          <h1 className="text-center text-primary">Admin Dashboard</h1>
        </Col>
      </Row>
      <Row>
        {adminFunctions.map((func, index) => (
          <Col key={index} xs={12} sm={6} md={4} lg={4} className="mb-4">
            <Card
              className="admin-card h-100 shadow-sm"
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

export default BoardAdmin;