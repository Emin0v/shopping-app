<template>

  <div class="container">
    <div class="btn-group" role="group" aria-label="Basic example">
<!--        <button type="button" class="btn btn-info m-1 "-->
<!--                v-for="category in categories" :key="category">-->
<!--          {{ category.name }}-->
<!--        </button>-->
      <a class="product-name" v-for="category in categories" :key="category"
                              v-bind:href="'/category/' + category.id">
        {{ category.name }}
      </a>

    </div>
  </div>

  <div class="container mt-5">
    <div class="card-deck">
      <div class="card">
        <img class="card-img-top" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
            content. This content is a little bit longer.</p>
        </div>
        <div class="card-footer">
          <small class="text-muted">Last updated 3 mins ago</small>
        </div>
      </div>
      <div class="card">
        <img class="card-img-top" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
        </div>
        <div class="card-footer">
          <small class="text-muted">Last updated 3 mins ago</small>
        </div>
      </div>
      <div class="card">
        <img class="card-img-top" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional
            content. This card has even longer content than the first to show that equal height action.</p>
        </div>
        <div class="card-footer">
          <small class="text-muted">Last updated 3 mins ago</small>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import {getCategories} from "@/common/product.service";
import {BASE_URL} from "@/common/config";

export default {
  name: 'home',
  data() {
    return {categories: {}}
  },
  created() {
    this.getCategories();
  },

  methods: {
    getCategories() {
      getCategories().then(response => {
        this.categories = response.data;
      });
    }

  }

}
</script>


