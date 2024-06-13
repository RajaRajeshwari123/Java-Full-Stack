import React, { useState } from "react";
import UserService from "../services/user.service";
import UpdateProduct from "./UpdateProduct";

const UpdateProductForm = () => {
  const [productId, setProductId] = useState('');
  const [product, setProduct] = useState(null);
  const [error, setError] = useState(null);
  const [showUpdateForm, setShowUpdateForm] = useState(false);
  const [responseMessage, setResponseMessage] = useState('');

  const handleProductIdChange = (e) => {
    setProductId(e.target.value);
  };

  const handleFormSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await UserService.getproductbyid(productId);
      setProduct(response.data);
      setShowUpdateForm(true);
      setError(null);
      setResponseMessage('Product details fetched successfully.');
    } catch (error) {
      console.error('Error fetching product:', error);
      setError('Error fetching product');
      setResponseMessage('Error fetching product. Please try again.');
    }
  };

  const handleProductUpdate = async (updatedProduct) => {
    try {
      await UserService.updateproduct(productId, updatedProduct);
      // Optional: You may want to fetch the updated product here to refresh the data
      setShowUpdateForm(false);
      setResponseMessage('Product updated successfully.');
    } catch (error) {
      console.error('Error updating product:', error);
      setError('Error updating product');
      setResponseMessage('Error updating product. Please try again.');
    }
  };

  return (
    <div className="container mt-5">
      <div className="card">
        <div className="card-header">
          <h3 className="mb-0">Update Product</h3>
        </div>
        <div className="card-body">
          <form onSubmit={handleFormSubmit}>
            <div className="mb-3">
              <label htmlFor="productId" className="form-label">Enter Product ID:</label>
              <input 
                type="text" 
                id="productId" 
                value={productId} 
                onChange={handleProductIdChange} 
                required 
                className="form-control"
              />
            </div>
            <button type="submit" className="btn btn-primary">Get Product Details</button>
          </form>
          {error && <p className="mt-4 text-danger">Error: {error}</p>}
          {responseMessage && <p className="mt-4">{responseMessage}</p>}
          {showUpdateForm && product && (
            <UpdateProduct product={product} onProductUpdate={handleProductUpdate} />
          )}
        </div>
      </div>
    </div>
  );
};

export default UpdateProductForm;
