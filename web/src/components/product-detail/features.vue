<template>
  <div class="row">
   <span style="text-align-last: left;" v-html="productFeatures"></span>
  </div>
  <hr/>
  <div class="row">
    info 2
  </div>
  <hr/>
  <div class="row">
    info 3
  </div>
  <hr/>
  <div class="row">
    info 4
  </div>
</template>

<script>
export default {
  name: "features",
  props: ['productFeatures']
}
</script>

<style scoped>
</style>