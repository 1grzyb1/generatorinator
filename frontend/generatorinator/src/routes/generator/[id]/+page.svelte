<svelte:head>
  <title>Generatorinator</title>
</svelte:head>

<script>
  import Box from "../../Box.svelte";
  import Input from "../../Input.svelte";
  import Button from "../../Button.svelte";
  import Column from "../../Column.svelte";

  export let data;
  let generated = ''

  function generate() {
    let columns = data.columns
    generated = ''
    columns.forEach(column => {
      let rows = column.rows
      let random = Math.floor(Math.random() * rows.length)
      generated += rows[random] + ' '
    })
  }
</script>


<div class="grid justify-items-center">
  <Box>
    <div style="width: 120rem">
      <div class="flex">
        <div style="width: 30rem" class="mr-5">
          <Button text="Generate" onClick="{generate}"/>
        </div>
        <div class="flex-auto">
          <Input label="Generated text" value={generated} disabled="true"/>
        </div>
      </div>

      <div class="text-2xl ml-2 mt-10">
        {data.name}
      </div>
      <div class="flex mt-10 space-x-10 max-w-fit overflow-x-auto">
        {#each data.columns as column}
          <div class="min-w-fit">
            <Column bind:rows="{column.rows}" disabled="true"/>
          </div>
        {/each}
      </div>
    </div>
  </Box>
</div>