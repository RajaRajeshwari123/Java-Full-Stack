import React, { useState } from "react";
import UserService from "../services/user.service";

const QuotationById = () => {
  const [quotationId, setQuotationId] = useState("");
  const [quotation, setQuotation] = useState(null);
  const [error, setError] = useState(null);

  // Function to fetch quotation by ID
  const getQuotationById = async () => {
    try {
      const response = await UserService.getQuotationById(quotationId);
      if (response.data) {
        setQuotation(response.data);
        setError(null); // Reset error state if successful
      } else {
        setQuotation(null); // Clear quotation if quotation is not found
        setError('Quotation not found.'); // Set error message if quotation is not found
      }
    } catch (error) {
      console.error('Error fetching quotation:', error);
      setQuotation(null); // Clear quotation if error occurs
      if (error.response && error.response.status === 404) {
        setError('Quotation not found.'); // Set error message if quotation is not found (HTTP 404)
      } else {
        setError('An unexpected error occurred.'); // Set generic error message for other errors
      }
    }
  };

  return (
    <div className="container">
      <h2 className="mt-4">View Quotation By ID</h2>
      <div className="input-group mb-3">
        <input
          type="number"
          className="form-control"
          placeholder="Enter quotation ID"
          value={quotationId}
          onChange={(e) => setQuotationId(e.target.value)}
        />
        <div className="input-group-append">
          <button
            className="btn btn-outline-secondary"
            type="button"
            onClick={getQuotationById}
          >
            View Quotation
          </button>
        </div>
      </div>
      {error && <p className="mt-4 text-danger"> {error}</p>}
      {quotation && (
        <div>
          <h3>Quotation ID: {quotation.id}</h3>
          <p>User ID: {quotation.userId}</p>
          <p>Product ID: {quotation.productId}</p>
          <p>Total Amount: {quotation.totalAmount}</p>
          <p>Quantity: {quotation.quantity}</p>
        </div>
      )}
    </div>
  );
};

export default QuotationById;
