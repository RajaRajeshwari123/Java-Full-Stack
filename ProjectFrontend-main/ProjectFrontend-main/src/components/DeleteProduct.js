import React, { useState } from "react";
import UserService from "../services/user.service";
// import "./Addproduct.css"; // Import your CSS file if needed

const DeleteProduct = () => {
  const [productId, setProductId] = useState('');
  const [error, setError] = useState(null);
  const [success, setSuccess] = useState(false);

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await UserService.delProduct(productId);
      setSuccess(true);
      setError(null);
    } catch (error) {
      console.error('Error deleting product:', error);
      if (error.response && error.response.status === 404) {
        setError('Product not found.');
      }
      else if (error.response && error.response.status === 500) {
        setError('Product with quotations cannot be deleted.');
      }
      else {
        setError('Error deleting product');
      }
    }
  };

  return (
    <div className="container mt-5">
      <div className="card">
        <div className="card-header">
          <h3 className="mb-0">Delete Product</h3>
        </div>
        <div className="card-body">
          <form onSubmit={handleSubmit}>
            <div className="mb-3">
              <label htmlFor="productId" className="form-label">Product ID:</label>
              <input type="number" id="productId" className="form-control" value={productId} onChange={(e) => setProductId(e.target.value)} required />
            </div>
            <button type="submit" className="btn btn-danger">Delete Product</button>
          </form>
          {success && (
            <div className="mt-4">
              <p className="text-success">Product deleted successfully.</p>
            </div>
          )}
          {error && <p className="mt-4 text-danger">Error: {error}</p>}
        </div>
      </div>
    </div>
  );
};

export default DeleteProduct;
