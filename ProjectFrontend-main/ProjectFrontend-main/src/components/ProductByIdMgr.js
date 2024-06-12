import React, { useState } from "react";
import UserService from "../services/user.service";

const ProductByIdMgr = () => {
  const [productId, setProductId] = useState("");
  const [product, setProduct] = useState(null);
  const [error, setError] = useState(null);

  // Function to fetch product by ID
  const getProductById = async () => {
    try {
      const response = await UserService.getproductbyidmanager(productId);
      if (response.data) {
        setProduct(response.data);
        setError(null); // Reset error state if successful
      } else {
        setProduct(null); // Clear product if product is not found
        setError('Product not found.'); // Set error message if product is not found
      }
    } catch (error) {
      console.error('Error fetching product:', error);
      setProduct(null); // Clear product if error occurs
      if (error.response && error.response.status === 404) {
        setError('Product not found.'); // Set error message if product is not found (HTTP 404)
      } else {
        setError('An unexpected error occurred.'); // Set generic error message for other errors
      }
    }
  };

  return (
    <div className="container">
      <h2 className="mt-4">View Product By ID</h2>
      <div className="input-group mb-3">
        <input
          type="number"
          className="form-control"
          placeholder="Enter product ID"
          value={productId}
          onChange={(e) => setProductId(e.target.value)}
        />
        <div className="input-group-append">
          <button
            className="btn btn-outline-secondary"
            type="button"
            onClick={getProductById}
          >
            View Product
          </button>
        </div>
      </div>
      {error && <p className="mt-4 text-danger"> {error}</p>}
      {product && (
        <div>
          <h3>Product: {product.name}</h3>
          {product.features.map(feature => (
            <div key={feature.id}>
              <h4>Feature: {feature.name}</h4>
              <ul>
                {feature.parameters.map(parameter => (
                  <li key={parameter.id}>
                    {parameter.name}: {parameter.value} ({parameter.type})
                  </li>
                ))}
              </ul>
            </div>
          ))}
        </div>
      )}
    </div>
  );
};

export default ProductByIdMgr;