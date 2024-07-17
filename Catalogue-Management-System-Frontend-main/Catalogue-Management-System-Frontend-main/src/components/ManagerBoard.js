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
import "./ManagerBoard.css";

const ManagerBoard = () => {
  const navigate = useNavigate();

  const managerFunctions = [
    { path: "/create-quotation", title: "Create Quotation", icon: faPlus },
    { path: "/get-quotation", title: "View Quotation", icon: faEye },
    { path: "/view-product-by-name-mgr", title: "View Product by Name", icon: faSearch },
    { path: "/view-all-products-mgr", title: "View All Products", icon: faEye },
    // { path: "/update-quotation/:quotationId", title: "Update Quotation", icon: faUserEdit},
  ];

  return (
    <Container fluid className="manager-dashboard py-4">
      <Row className="mb-4">
        <Col>
          <h1 className="text-center text-primary">Manager Dashboard</h1>
        </Col>
      </Row>
      <Row>
        {managerFunctions.map((func, index) => (
          <Col key={index} xs={12} sm={6} md={4} lg={4} className="mb-4">
            <Card
              className="manager-card h-100 shadow-sm"
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

export default ManagerBoard;